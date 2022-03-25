 static void fileReadWrite() throws IOException
    {
        File file = new File("");
        FileInputStream inputStream = new FileInputStream(file);
        Scanner sc = new Scanner(inputStream);
        StringBuffer buffer = new StringBuffer();
        while (sc.hasNext())
            buffer.append("\n"+sc.nextLine());
        File des = new File("C:\\CapSpace\\src\\com\\company\\capgemini\\Assignment\\CopiedFile.txt");
        FileWriter writer = new FileWriter(des);
        writer.write(buffer.toString());
        writer.flush();
        System.out.println("File content copied and written successfully.");
    }
