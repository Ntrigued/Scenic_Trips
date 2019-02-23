package com.matthewallbee.graph;
 
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
 
import com.univocity.parsers.tsv.TsvParser;
import com.univocity.parsers.tsv.TsvParserSettings;

 
public class RoadGraph
{
    public int[][] loadRoadNetwork() throws IOException
    {
        String fileName = "roadtNet-CA_adj.tsv";
        ClassLoader classLoader = new RoadGraph().getClass().getClassLoader();
        File graphFile = new File(classLoader.getResource(fileName).getFile());
		
		TsvParserSettings settings = new TsvParserSettings();
		settings.getFormat().setLineSeparator("\n");
		TsvParser parser = new TsvParser(settings);
		List
		<String[]> allRows = parser.parseAll( new FileReader(graphFile) );

		int[][] adjMatrix = new int[allRows.size()][allRows.get(0).length];
		for(int x = 0; x < adjMatrix.length; x++)
		{
			for(int y = 0; y < adjMatrix[0].length; y++)
			{
				adjMatrix[x][y] = Integer.parseInt( allRows.get(x)[y] );
			}
		}
		
		return adjMatrix;
	}
}