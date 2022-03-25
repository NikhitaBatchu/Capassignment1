static void mapKeySort() {
        Map<String, String> map = new HashMap<>();
        map.put("10", "Teju");
        map.put("5","Harsha");
        map.put("2","Hari");
        map.put("20","Yoshita");
        map.put("15","Vardhan");

        Map<String,String>  sorted=new TreeMap<>(map);
        System.out.println("Sorted Map :");
        for(Map.Entry<String,String> entry:sorted.entrySet())
        {
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }

    public static void main (String[]args){
    mapKeySort ob=new mapKeySort()
    ob.mapKeySort();
    }
