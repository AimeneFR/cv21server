<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" >
	<xsl:template match="/cv21">
	<xsl:element name="html">
		  <body>
		    <h2>Le 10 février 2021</h2>
		    <h2>CV21 - XSLT V1.0</h2>
		    <h1><xsl:value-of select="objectif"/></h1>
		  	<p>demande de <xsl:value-of select="objectif/@statut"/></p>
		  	<h1><xsl:value-of select="Identite/genre"/>&#160;<xsl:value-of select="Identite/nom"/>&#160;<xsl:value-of select="Identite/prenom"/></h1>
		  	<p>Tel: <xsl:value-of select="Identite/tel"/><br/>
		  	Mel: <xsl:value-of select="Identite/mel"/>
		  	</p>
		  	<h1>Expérience professionnelles</h1>
		  	<ol>
		  	<xsl:for-each select="prof/expe">
		  		<li><xsl:value-of select="./titre"/>&#160;(du&#160;<xsl:value-of select="./datedeb"/>&#160;au&#160;<xsl:value-of select="./datefin"/>)</li>
		  	</xsl:for-each>
		  	</ol>
		  	<h1>Diplomes</h1>
		  	<table>
		  		<tbody>
		  			<xsl:for-each select="competences/diplome">
		  				<tr>
		  					<td><xsl:value-of select="./date"/></td>
		  					<td><xsl:value-of select="./titre"/></td>
		  					<td>(<xsl:value-of select="./@niveau"/>)</td>
		  					<td><xsl:value-of select="./etab"/></td>
		  				</tr>
		  			</xsl:for-each>
		  		</tbody>
		  	</table>
		  	<h1>Certifications</h1>
		  	<table>
		  		<tbody>
		  			<xsl:for-each select="competences/certif">
		  				<tr>
		  					<td><xsl:value-of select="./datedeb"/>&#160;-&#160;<xsl:value-of select="./datefin"/></td>
		  					<td><xsl:value-of select="./titre"/></td>
		  				</tr>
		  			</xsl:for-each>
		  		</tbody>
		  	</table>
		  	<h1>Langues</h1>
		  	<ul>
		  		<xsl:for-each select="divers/lv">
		  				<li><xsl:value-of select="./@lang"/>&#160;:&#160;<xsl:value-of select="./@cert"/>&#160;(<xsl:value-of select="./@nivi"/>)</li>
		  		</xsl:for-each>
		  	</ul>
		  	<h1>Divers</h1>
		  	<ul>
		  		<xsl:for-each select="divers/autre">
		  				<li><xsl:value-of select="./@titre"/>&#160;:&#160;<xsl:value-of select="./@comment"/></li>
		  		</xsl:for-each>
		  	</ul>
		  </body>
	</xsl:element>
	</xsl:template>
	
	
</xsl:stylesheet>