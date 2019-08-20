package com.练习.cv;



import java.util.*;

public class Test {
    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("壮壮",80));
       studentList.add(new Student("闷闷",82));
       studentList.add(new Student("勇勇",81));

      ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("壮壮2号",80));
        studentsList.add(new Student("闷闷2号",82));
        studentsList.add(new Student("勇勇2号",81));

        HashMap<String,ArrayList<Student>> hashMap1 = new HashMap<>();
        hashMap1.put("终极一班",studentList);
        HashMap<String,ArrayList<Student>> hashMap2 = new HashMap<>();
        hashMap1.put("终极二班",studentsList);

        Set<Map.Entry<String,ArrayList<Student>>> entries = hashMap1.entrySet();
        Set<Map.Entry<String,ArrayList<Student>>> entries2 = hashMap2.entrySet();

      for(Map.Entry<String,ArrayList<Student>> keyValue:entries){
           String key = keyValue.getKey();
         ArrayList<Student> students = keyValue.getValue();
          for(Student s:students){
                Student stu = s;
               System.out.println(key+ " "+s.getName()+" "+s.getScore());
            }

        }




      /* HashMap<String, HashMap<String, ArrayList<Student>>> map = new HashMap<>();


        ArrayList<Student> students1 = new ArrayList<>();
        students1.add(new Student("项羽",66));
        students1.add(new Student("刘邦",77));
        students1.add(new Student("陈胜",55));

        ArrayList<Student> students2 = new ArrayList<>();
        students2.add(new Student("诸葛亮",100));
        students2.add(new Student("姜维",80));
        students2.add(new Student("司马昭",0));
        HashMap<String,ArrayList<Student>> hashMap  = new HashMap<>();
        hashMap.put("君王班",students1);
        HashMap<String,ArrayList<Student>> hashMap1  = new HashMap<>();
        hashMap1.put("忠臣班",students1);

        HashMap<String, HashMap<String, ArrayList<Student>>> map1 = new HashMap<>();
        map.put("希望小学",hashMap);
        map1.put("皮皮小学",hashMap1);
        Set<Map.Entry<String,HashMap<String,ArrayList<Student>>>> entrySet = map.entrySet();
        Set<Map.Entry<String,ArrayList<Student>>> set = hashMap.entrySet();
        for(Map.Entry<String,HashMap<String,ArrayList<Student>>> keyValue :entrySet){
            String key = keyValue.getKey();
            for(Map.Entry<String,ArrayList<Student>> keyValue1:set){
                String key1 = keyValue1.getKey();
                ArrayList<Student> list = keyValue1.getValue();
                    for(Student l:list){
                        System.out.println(key+" "+key1+" "+l.getName()+" "+l.getScore());
                    }

            }

        }
        Set<Map.Entry<String,HashMap<String,ArrayList<Student>>>> entrySet1 = map1.entrySet();
        Set<Map.Entry<String,ArrayList<Student>>> set1 = hashMap1.entrySet();
        for(Map.Entry<String,HashMap<String,ArrayList<Student>>> keyValue :entrySet1){
            String key = keyValue.getKey();
            for(Map.Entry<String,ArrayList<Student>> keyValue1:set1){
                String key1 = keyValue1.getKey();
                ArrayList<Student> list = keyValue1.getValue();
                for(Student l:list){
                    System.out.println(key+" "+key1+" "+l.getName()+" "+l.getScore());
                }

            }

        }*/



    }
}
