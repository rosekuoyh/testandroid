package test.testframe;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
//import android.widget.ImageView;
//import android.widget.TextView;

public class SensorFragment extends Fragment
{
    private double arr[][];
    private TextView gas, co2, pm25, pm10;
    private double totalgas = 0, totalco2 = 0, totalpm25 = 0, totalpm10 = 0;

    //顯示文字內容
//    private String text = "";
    public SensorFragment(){

    }

    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);

        //取得MainActivity的方法，將文字放入text字串
//        Tab mTab = (Tab) activity;
//        text = mTab.getSensorText();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.fl_sensor, container, false);
        double newarr[][] = (double[][]) this.getArguments().getSerializable("arr");
        calculate(newarr);
        gas = (TextView) rootView.findViewById(R.id.txt_gas);
        co2 = (TextView) rootView.findViewById(R.id.txt_co2);
        pm25 = (TextView) rootView.findViewById(R.id.txt_pm25);
        pm10 = (TextView) rootView.findViewById(R.id.txt_pm10);

        gas.setText(String.valueOf(arr[1][1]));
        return rootView;
    }

    private double[][] calculate(double newarr[][]) {
        for(int i = 0; i < newarr[1].length;i++) {
            totalgas = totalgas + newarr[1][i];
        }
        arr[1][1] = totalgas / newarr[1].length;
        return arr;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        //取得TextView元件並帶入text字串
//        TextView mText = getView().findViewById(R.id.text);
//        mText.setText(text);

        //取得ImageView元件並帶入指定圖片
//        ImageView mImg = getActivity().findViewById(R.id.img);
//        mImg.setImageResource(R.drawable.ic_insert_emoticon_black_24dp);
    }
}
