package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentTransaction;
import android.os.Bundle;


public class kecheng extends AppCompatActivity {

    private FragmentTransaction beginTransaction;
    //设置文字
    private String[] settingText = {"" +
            "1.高等数学是由微积分学，较深入的代数学、几何学以及它们之间的交叉内容所形成的一门基础学科。主要内容包括：数列、极限、微积分、空间解析几何与线性代数、级数、常微分方程\n" +
            "2.现实世界的各种事物都以有限的形式出现，无穷是对他们的共同本质的一种概括。所以，无穷进入数学是数学高度理论化、抽象化的反映。数学中的无穷以潜无穷和实无穷两种形式出现。在极限过程中，变量的变化是无止境的，属于潜无穷的形式。而极限值的存在又反映了实无穷过程。最基本的极限过程是数列和函数的极限。数学分析以它为基础，建立了刻画函数局部和总体特征的各种概念和有关理论，初步成功地描述了现实世界中的非均匀变化和运动。另外一些形式上更为抽象的极限过程，在别的数学学科中也都起着基本的作用。还有许多学科的研究对象本身就是无穷多的个体，也就说是无穷集合，例如群、环、域之类及各种抽象空间。这是数学中的实无穷。能够处理这类无穷集合，是数学水平与能力提高的表现。为了处理这类无穷集合，数学中引进了各种结构，如代数结构、序结构和拓扑结构。另外还有一种度量结构，如抽象空间中的范数、距离和测度等，它使得个体之间的关系定量化、数字化，成为数学的定性描述和定量计算两方面的桥梁。上述结构使得这些无穷集合具有丰富的内涵，能够彼此区分，并由此形成了众多的数学学科。。\n" +
            "3.大一男生认为高数难学，担心期末高数挂科，将高数公式写满寝室的墙面，并且自称“高考时数学只考了124分”数学这门学科想必大家都接触过，那可是令无数人都感到头疼甚至绝望的存在。随着学业的拓展，难度系数那也自然是越来越大。\n" +
            "在大学里，许多理科专业还要开设“高等数学”的相关课程，许多数学成绩不好的同学对此更是叫苦不迭了。当然了，谦虚的“学霸”们自然没问题，却也不敢小看高数这门课。吉林大学近期正在举行寝室文化节，一个宿舍的墙上被贴满了黑板纸，黑板纸上竟然写满了微积分的公式。\n" +
            "这间宿舍来自吉林大学的交通学院，一位叫李昊的同学之手，他十分的谦虚，认为自己的数学不太好，高考时也只考了124分。\n" +
            "进入了大学之后，因为专业原因需要学习高数，他觉得高数更难，为了期末考试不挂科，他便想到了这么一个办法。同寝室的舍友们对李昊的做法也是感到认同并且大力支持。不得不说，这个方法真的不错。\n" +
            "4.~~~~~~~~~~~~~~·史上最令人惊奇事件~~~~~~~~~~~~~\n"
    };
    //设置图标
    private int[] settingicons = {R.drawable.gs,R.drawable.gsgk,R.drawable.gskl,R.drawable.gssk,R.drawable.gsgk,R.drawable.yzygs,R.drawable.yzwz,R.drawable.yz};
    private String[] foodNames = {"高数","史上惊人事件","研究表明高数让人变得更愉快？","名师授课快速上门","高数界的‘名媛’","高数与宇宙","未知的高数","明天的数学"};
    //获取图标数组的方法
    public int[] getIcons() {
        return settingicons;
    }
    //获取设置菜品名称的方法
    public String[] getNames(){
        return foodNames;
    }
    //获取设置文字的方法
    public String[] getSettingText(){
        return settingText;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kecheng);

        ContentFragment contentFragment = new ContentFragment();
        MenuFragment menuFragment = new MenuFragment();
        beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.foodcontent,contentFragment);
        beginTransaction.replace(R.id.menu,menuFragment);
        beginTransaction.commit();


    }
}