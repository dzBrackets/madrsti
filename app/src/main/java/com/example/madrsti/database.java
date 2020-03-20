package com.example.madrsti;

public class database {

    static data[] math= new data[10];
    static data arabic[]= new data[10];
    static data science[]= new data[10];
    static data animal[]= new data[10];
    public database(){
        loadMathData();
        loadArabicData();
        loadScienceData();
        loadAnimalData();
    }

    void initdata(data[] Data){ //array initialization
        for (int i = 0; i < Data.length; i++) {
            Data[i]=new data();
        }
    }
    void loadMathData(){
        initdata(math);
        math[0].fillType1("ماهو مجموع 20+ 16 ؟", new String[]{"36","46","26","56"},1);
        math[1].fillType1("ما هو العدد الذي يلي مباشرة 76 ؟", new String[]{"75","77","78","74"},2);
        math[2].fillType1("ماهو العدد الأكبر من 26 ؟", new String[]{"25","27","21","24"},2);
        math[3].fillType1("ماهو العدد الذي يسبق مباشرة 34 ؟", new String[]{"33","32","35","36"},1);
        math[4].fillType1("ماهي مساحة المستطيل ؟", new String[]{"طول الضلع * 4","القاعدة * الارتفاع","الطول*العرض","(الطول+العرض)*2"},3);
        math[5].fillType1("ما هو العدد الذي يلي مباشرة 45 ؟ ", new String[]{"44","43","47","46"},4);
        math[6].fillType1("ماهو مجموع 6+5 ؟ ", new String[]{"65","56","10","11"},4);
        math[7].fillType1("ماهو العدد الأصغر من 90 ؟ ", new String[]{"99","70","91","92"},2);
        math[8].fillType1("كم يساوي المتر بالسنتيمتر ؟", new String[]{"10","60","100","1000"},3);
        math[9].fillType1("ماهي عملية الحصر الصّحيحة ؟", new String[]{"14>12>9","8>7>11","20>19>32","0>1>2"},1);

    }
    void loadArabicData(){
        //type1

    }
    void loadScienceData(){
        //type1

    }
    void loadAnimalData(){
        //type1

    }


    //Setters & Getters

    public static data[] getMath() {
        return math;
    }

    public static void setMath(data[] math) {
        database.math = math;
    }

    public static data[] getArabic() {
        return arabic;
    }

    public static void setArabic(data[] arabic) {
        database.arabic = arabic;
    }

    public static data[] getScience() {
        return science;
    }

    public static void setScience(data[] science) {
        database.science = science;
    }

    public static data[] getAnimal() {
        return animal;
    }

    public static void setAnimal(data[] animal) {
        database.animal = animal;
    }
}
