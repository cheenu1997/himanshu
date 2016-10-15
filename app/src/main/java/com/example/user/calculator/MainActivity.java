package com.example.user.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    double temporary[];
    boolean function[];
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView1);
        Button clear = (Button) findViewById(R.id.clear);
        temporary = new double[2];
        assert clear != null;
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("0");
                for (int i = 0; i < 2; i++) {
                    temporary[i] = 0;
                }
                for (int i = 0; i < 4; i++) {
                    function[i] = false;
                }
            }
        });
        Button negative = (Button) findViewById(R.id.negative);
        assert negative != null;
        negative.setOnClickListener(this);
        Button seven = (Button) findViewById(R.id.seven);
        assert seven != null;
        seven.setOnClickListener(this);
        Button eight = (Button) findViewById(R.id.eight);
        assert eight != null;
        eight.setOnClickListener(this);
        Button nine = (Button) findViewById(R.id.nine);
        assert nine != null;
        nine.setOnClickListener(this);
        Button four = (Button) findViewById(R.id.four);
        assert four != null;
        four.setOnClickListener(this);
        Button five = (Button) findViewById(R.id.five);
        assert five != null;
        five.setOnClickListener(this);
        Button six = (Button) findViewById(R.id.six);
        assert six != null;
        six.setOnClickListener(this);
        Button three = (Button) findViewById(R.id.three);
        assert three != null;
        three.setOnClickListener(this);
        Button two = (Button) findViewById(R.id.two);
        assert two != null;
        two.setOnClickListener(this);
        Button one = (Button) findViewById(R.id.one);
        assert one != null;
        one.setOnClickListener(this);
        Button plus = (Button) findViewById(R.id.add);
        assert plus != null;
        plus.setOnClickListener(this);
        Button subtract = (Button) findViewById(R.id.subtract);
        assert subtract != null;
        subtract.setOnClickListener(this);
        Button multiply = (Button) findViewById(R.id.multi);
        assert multiply != null;
        multiply.setOnClickListener(this);
        Button divide = (Button) findViewById(R.id.divide);
        assert divide != null;
        divide.setOnClickListener(this);
        Button point = (Button) findViewById(R.id.point);
        assert point != null;
        point.setOnClickListener(this);
        Button equal=(Button) findViewById(R.id.equal);
        assert equal!=null;
        equal.setOnClickListener(this);
        function = new boolean[4];
        for (int i = 0; i < 4; i++) {
            function[i] = false;
        }
    }
    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.negative) {
            double value = Double.parseDouble(text.getText().toString());
            if (value != 0) {
                value = value * (-1);
                text.setText(Double.toString(value));
            }
        }
        if (id == R.id.seven) {
            double value=Double.parseDouble(text.getText().toString());
            int flag=0;
            String g=text.getText().toString();
            int i;
            for( i=0;i<=g.length()-1;i++)
            {
                char y=g.charAt(i);
                if(y=='.')
                {
                    break;
                }
            }
            if(i<=g.length()-1)
            {
                text.append("7");
                flag++;
            }
            if(flag==0)
            {
                if (value != 0) {
                    text.append("7");
                } else {
                    int x=7;
                    text.setText(Integer.toString(x));
                }
            }

        }
        if (id == R.id.eight) {
            double value=Double.parseDouble(text.getText().toString());
            int flag=0;
            String g=text.getText().toString();
            int i;
            for( i=0;i<=g.length()-1;i++)
            {
                char y=g.charAt(i);
                if(y=='.')
                {
                    break;
                }
            }
            if(i<=g.length()-1)
            {
                text.append("8");
                flag++;
            }
            if(flag==0)
            {
                if (value != 0) {
                    text.append("8");
                } else {
                    int x=8;
                    text.setText(Integer.toString(x));
                }
            }

        }
        if (id == R.id.nine) {
            double value=Double.parseDouble(text.getText().toString());
            int flag=0;
            String g=text.getText().toString();
            int i;
            for( i=0;i<=g.length()-1;i++)
            {
                char y=g.charAt(i);
                if(y=='.')
                {
                    break;
                }
            }
            if(i<=g.length()-1)
            {
                text.append("9");
                flag++;
            }
            if(flag==0)
            {
                if (value != 0) {
                    text.append("9");
                } else {
                    int x=9;
                    text.setText(Integer.toString(x));
                }
            }

        }
        if (id == R.id.four) {
            double value=Double.parseDouble(text.getText().toString());
            int flag=0;
            String g=text.getText().toString();
            int i;
            for( i=0;i<=g.length()-1;i++)
            {
                char y=g.charAt(i);
                if(y=='.')
                {
                    break;
                }
            }
            if(i<=g.length()-1)
            {
                text.append("4");
                flag++;
            }
            if(flag==0)
            {
                if (value != 0) {
                    text.append("4");
                } else {
                    int x=4;
                    text.setText(Integer.toString(x));
                }
            }

        }
        if (id == R.id.five) {
            double value=Double.parseDouble(text.getText().toString());
            int flag=0;
            String g=text.getText().toString();
            int i;
            for( i=0;i<=g.length()-1;i++)
            {
                char y=g.charAt(i);
                if(y=='.')
                {
                    break;
                }
            }
            if(i<=g.length()-1)
            {
                text.append("5");
                flag++;
            }
            if(flag==0)
            {
                if (value != 0) {
                    text.append("5");
                } else {
                    int x=5;
                    text.setText(Integer.toString(x));
                }
            }

        }
        if (id == R.id.six) {
            double value=Double.parseDouble(text.getText().toString());
            int flag=0;
            String g=text.getText().toString();
            int i;
            for( i=0;i<=g.length()-1;i++)
            {
                char y=g.charAt(i);
                if(y=='.')
                {
                    break;
                }
            }
            if(i<=g.length()-1)
            {
                text.append("6");
                flag++;
            }
            if(flag==0)
            {
                if (value != 0) {
                    text.append("6");
                } else {
                    int x=6;
                    text.setText(Integer.toString(x));
                }
            }

        }
        if (id == R.id.three) {
            double value=Double.parseDouble(text.getText().toString());
            int flag=0;
            String g=text.getText().toString();
            int i;
            for( i=0;i<=g.length()-1;i++)
            {
                char y=g.charAt(i);
                if(y=='.')
                {
                    break;
                }
            }
            if(i<=g.length()-1)
            {
                text.append("3");
                flag++;
            }
            if(flag==0)
            {
                if (value != 0) {
                    text.append("3");
                } else {
                    int x=3;
                    text.setText(Integer.toString(x));
                }
            }

        }
        if (id == R.id.two) {
            double value=Double.parseDouble(text.getText().toString());
            int flag=0;
            String g=text.getText().toString();
            int i;
            for( i=0;i<=g.length()-1;i++)
            {
                char y=g.charAt(i);
                if(y=='.')
                {
                    break;
                }
            }
            if(i<=g.length()-1)
            {
                text.append("2");
                flag++;
            }
            if(flag==0)
            {
                if (value != 0) {
                    text.append("2");
                } else {
                    int x=2;
                    text.setText(Integer.toString(x));
                }
            }

        }
        if (id == R.id.one) {
            double value=Double.parseDouble(text.getText().toString());
            int flag=0;
            String g=text.getText().toString();
            int i;
            for( i=0;i<=g.length()-1;i++)
            {
                char y=g.charAt(i);
                if(y=='.')
                {
                    break;
                }
            }
            if(i<=g.length()-1)
            {
                text.append("1");
                flag++;
            }
            if(flag==0)
            {
                if (value != 0) {
                    text.append("1");
                } else {
                    int x=1;
                    text.setText(Integer.toString(x));
                }
            }

        }
        if (id == R.id.add) {
            double value = Double.parseDouble(text.getText().toString());
            temporary[0] = value;
            function[0]=true;
            text.setText("0");
        }
        if(id==R.id.subtract)
        {
            double value = Double.parseDouble(text.getText().toString());
            temporary[0] = value;
            function[1]=true;
            text.setText("0");

        }
        if(id==R.id.multi)
        {
            double value = Double.parseDouble(text.getText().toString());
            temporary[0] = value;
            function[2]=true;
            text.setText("0");
        }
        if(id==R.id.divide)
        {
            double value = Double.parseDouble(text.getText().toString());
            temporary[0] = value;
            function[3]=true;
            text.setText("0");
        }
        if(id==R.id.point)
        {
           // double value = Double.parseDouble(text.getText().toString());
            text.append(".");
        }
        if (id == R.id.equal) {
            double result = 0;
            temporary[1] = Double.parseDouble(text.getText().toString());
            text.setText("0");

            if(function[2])
                result = temporary[0] * temporary[1];
            else if(function[3])
                result = temporary[0] / temporary[1];
            else if(function[0])
                result = temporary[0] + temporary[1];
            else if(function[1])
                result = temporary[0] - temporary[1];
            text.setText(Double.toString(result));
            for(int i = 0; i < 4; i++)
                function[i] = false;
        }

        }

    }


