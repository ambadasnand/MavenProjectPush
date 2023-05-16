package maventestproject;

import java.io.FileReader;

import com.opencsv.CSVReader;

public class CSVReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CSVReader reader = null;
		
		try {
			
			reader = new CSVReader (new FileReader("D:\\test.csv"));
			
			String[] next;
			while (( next = reader.readNext())!=null ) {
				
				for ( String csvfileValues:next) {
					
					System.out.println(csvfileValues + "  ");
				}
				System.out.println("\n");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
