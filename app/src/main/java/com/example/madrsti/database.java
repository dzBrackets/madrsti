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
        initdata(arabic);
        arabic[0].fillType1("ضد كلمة ضيق",new String[]{"كبير","واسع","طويل","صغير"},2);
        arabic[1].fillType1("مرادف كلمة بقاع",new String[]{"اعمال","اشخاص","بحور","اماكن"},4);
        arabic[2].fillType1("جمع كلمة دلو",new String[]{"دلاوين","دلاوون","دلاء","دلاوات"},3);
        arabic[3].fillType1("مفرد كلمة محاريب",new String[]{"محراب","محارب","حرب","محاربة"},1);
        arabic[4].fillType1("نام (عمر) باكرا",new String[]{"فعل","مفعول به","صفة","فاعل"},4,"اعرب ما بين قوسين");
        arabic[5].fillType1("اعجبني (هذا) العمل",new String[]{"اسم موصول","ضمير متصل","اسم اشارة","ضمير مستتر"},3,"اعرب ما بين قوسين");
        arabic[6].fillType1("ضد كلمة مفيدة",new String[]{"ضارة","مملة","نافعة","صعبة"},1);
        arabic[7].fillType1("مرادف كلمة عهد",new String[]{"وعد","عصر","مكان","جهة"},2);
        arabic[8].fillType1("جمع كلمة سائل",new String[]{"اسئلة","سائلين","سائلون","سوائل"},4);
        arabic[9].fillType1("مفرد كلمة زوار",new String[]{"زر","زار","زائر","ازرار"},3);

    }
    void loadScienceData(){
        initdata(science);
        science[0].fillType1("أكمل : الكتلة = الحجم X...",new String[]{"المساحة","الوزن","الكثافة","الثقل"},3);
        science[1].fillType1("ماذا يطلق على عملية تحويل المادة الصلبة إلى سائلة ؟",new String[]{"التبخّر","الغليان","الانصهار","التسامي"},3);
        science[2].fillType1("هي المقدرة على بذل جهد فما هي ؟",new String[]{"القوة","القدرة","الحركة","الطاقة"},4);
        science[3].fillType1("كم قطبا للمغناطيس؟",new String[]{"قطب واحد","قطبان","ثلاثة أقطاب","أربعة أقطاب"},2);
        science[4].fillType1("هل يزيد حجم الماء أو ينقص إذا تجمّد ؟",new String[]{"يقل بسبب التجمّد","يزيد بسبب التمدّد","يقل لأنه ينقسم","يبقى كما هو"},2);
        science[5].fillType1("كم عدد غرف أو حجرات القلب ؟",new String[]{"3 غرف","8 غرف","5 غرف","4 غرف"},4);
        science[6].fillType1("كم عدد اضلع القفص الصدري للإنسان ؟",new String[]{"12 ضلع","24 ضلع","6 اضلع","36 ضلع"},1);
        science[7].fillType1("ماهو عدد الاسنان في الانسان البالغ ؟",new String[]{"28","32","25","38"},2);
        science[8].fillType1("ما هو عدد كواكب المجموعة الشمسية؟",new String[]{"2","4","6","8"},4);
        science[9].fillType1("ما هو أسرع حيوان بري في العالم؟",new String[]{"النمر","الاسد","الفهد","الذئب"},3);

    }
    void loadAnimalData(){
        initdata(animal);

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
