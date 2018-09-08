package test.testframe;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
//import android.view.View;

//import android.widget.TextView;

public class Tab extends FragmentActivity
{
//    private View indicator = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        //獲取TabHost控制元件
        FragmentTabHost mTabHost =  findViewById(android.R.id.tabhost);
        //設定Tab頁面的顯示區域，帶入Context、FragmentManager、Container ID
        mTabHost.setup(this, getSupportFragmentManager(), R.id.container);

        mTabHost.addTab(mTabHost.newTabSpec("one")
                        .setIndicator("",getResources().getDrawable(R.drawable.ic_pie_chart_black_24dp))
                ,SensorFragment.class,null);


        //同上方Tab設定，不同處為帶入參數的差異

        mTabHost.addTab(mTabHost.newTabSpec("two")
                        .setIndicator("",getResources().getDrawable(R.drawable.ic_place_black_24dp))
                ,MapFragment.class,null);

        //同上方Tab設定，不同處為帶入參數的差異
        mTabHost.addTab(mTabHost.newTabSpec("three")
                        .setIndicator("",getResources().getDrawable(R.drawable.ic_person_black_24dp))
                ,UserFragment.class, null);

    }





    //Tab - Lesson One的文字內容
//    public String getSensorText()
//    {
//        return "sensor";
//    }

    //Tab - Lesson Two的文字內容
//    public String getMapText()
//    {
//        return "小黑人的Android教室\n- 第二堂課 -";
//    }

    //Tab - Lesson Three的文字內容
//    public String getUserText()
//    {
//        return "小黑人的Android教室\n- 第三堂課 -";
//    }

    //Tab - Lesson Four的文字內容
//    public String getLessonFourText()
//    {
//        return "小黑人的Android教室\n- 第四堂課 -";
//    }
}
