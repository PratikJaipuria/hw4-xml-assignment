<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html"/>
	<xsl:template match="/website">
		<!-- TODO: Auto-generated template -->
		<H1>Website</H1>	
		<H2> Pages </H2>
			
			
			<OL>
				<xsl:for-each select="/website/page">
					<LI>
						<xsl:value-of select="@name"/>, <xsl:value-of select="description"/>
					</LI>
				</xsl:for-each>
			</OL>
	
	<H2>Widgets</H2>
		<TABLE border="1">
			<THEAD>
				<TR>	<TH>Id</TH>	<TH>type</TH> <TH>text</TH>
						<TH>src</TH> <TH>url</TH> <TH>label</TH>
				</TR>
			</THEAD>
			<TBODY>
				<xsl:for-each select="/website/page/widget">
			<!-- next set of slides -->
				<TR>
						<TD><xsl:value-of select="@id"/></TD>
						<TD><xsl:value-of select="@type"/></TD>
						<TD><xsl:value-of select="text"/></TD>
						<TD><xsl:value-of select="@src"/></TD>
						<TD><xsl:value-of select="@url"/></TD>
						<TD><xsl:value-of select="@label"/></TD>
						
				</TR>
				
				</xsl:for-each>
									
			</TBODY>
		</TABLE>
	
	
	</xsl:template>
		
	
</xsl:stylesheet>