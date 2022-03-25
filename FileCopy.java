 static void fileReadWrite() throws IOException
    {
        File file1 = new File("https://github.com/NikhitaBatchu/Capassignment1/blob/main/MinMaxElement.java");
        FileInputStream inputStream = new FileInputStream(file1);
        Scanner sc = new Scanner(inputStream);
        StringBuffer buffer = new StringBuffer();
        while (sc.hasNext())
            buffer.append("\n"+sc.nextLine());
        File file2 = new File("");
        FileWriter writer = new FileWriter(file2);
        writer.write(buffer.toString());
        writer.flush();
        System.out.println("File content copied and written successfully.");
    }
