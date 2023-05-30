package practice;//import org.apache.commons.jexl3.*;
//import com.opencsv.*;
//public class CSVProcessor {
//    public static void main(String[] args) {
//        try {
//            // Read input CSV file
//            CSVReader reader = new CSVReader(new FileReader("input.csv"));
//            List<String[]> inputRows = reader.readAll();
//            reader.close();
//
//            // Create output CSV file
//            CSVWriter writer = new CSVWriter(new FileWriter("output.csv"));
//
//            // Process each row of input data
//            for (String[] inputRow : inputRows) {
//                String[] outputRow = new String[inputRow.length];
//                for (int i = 0; i < inputRow.length; i++) {
//                    String cell = inputRow[i];
//                    if (cell.startsWith("=")) {
//                        // Parse and evaluate formula
//                        String formula = cell.substring(1);
//                        JexlEngine jexl = new JexlBuilder().create();
//                        JexlExpression expr = jexl.createExpression(formula);
//                        JexlContext context = new MapContext();
//                        for (int j = 0; j < inputRow.length; j++) {
//                            context.set("col" + (j + 1), inputRow[j]);
//                        }
//                        Object result = expr.evaluate(context);
//                        outputRow[i] = result.toString();
//                    } else {
//                        // Copy value
//                        outputRow[i] = cell;
//                    }
//                }
//                writer.writeNext(outputRow);
//            }
//
//            // Close output CSV file
//            writer.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
import java.io.BufferedReader;
        import java.io.FileReader;
        import java.io.FileWriter;
        import java.io.IOException;
        import java.util.ArrayList;

        import java.util.List;

public class CSVProcessor {

    public static void main(String[] args) throws IOException {
        String inputFilename = "input.csv";
        String outputFilename = "output.csv";

        List<String[]> inputData = readCSV(inputFilename);
        List<String[]> outputData = processCSV(inputData);
        writeCSV(outputData, outputFilename);
    }

    public static List<String[]> readCSV(String filename) throws IOException {
        List<String[]> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                data.add(row);
            }
        }
        return data;
    }

    public static List<String[]> processCSV(List<String[]> inputData) {
        List<String[]> outputData = new ArrayList<>();
        for (String[] row : inputData) {
            String[] newRow = new String[row.length];
            for (int i = 0; i < row.length; i++) {
                String cellValue = row[i];
                if (cellValue.startsWith("=")) {
                    String formula = cellValue.substring(1);
                    newRow[i] = String.valueOf(evaluateFormula(formula, inputData));
                } else {
                    newRow[i] = cellValue;
                }
            }
            outputData.add(newRow);
        }
        return outputData;
    }

    public static double evaluateFormula(String formula, List<String[]> inputData) {
        String[] tokens = formula.split("\\+");
        double result = 0.0;
        for (String token : tokens) {
            if (token.matches("[A-Za-z]\\d+")) {
                int row = Integer.parseInt(token.replaceAll("\\D", "")) - 1;
                int col = (int)token.charAt(0) - (int)'A';
                String cellValue = inputData.get(row)[col];
                if (cellValue.startsWith("=")) {
                    cellValue = String.valueOf(evaluateFormula(cellValue.substring(1), inputData));
                }
                result += Double.parseDouble(cellValue);
            } else {
                result += Double.parseDouble(token);
            }
        }
        return result;
    }

    public static void writeCSV(List<String[]> data, String filename) throws IOException {
        try (FileWriter fw = new FileWriter(filename)) {
            for (String[] row : data) {
                fw.write(String.join(",", row) + "\n");
            }
        }
    }
}