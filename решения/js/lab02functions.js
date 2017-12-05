function task4411(x){
    return parseFloat(x) + 7;
}
function task9298(a){
    if (a <= 0){
        throw new Error("Значение A должно быть положительным");
    }
    return 6 * a * a;
}
function task3354(a){
    if (a <= 0){
        throw new Error("Значение A должно быть положительным");
    }
    return a * a * a;
}
function task5201(r){
    if (r <= 0){
        throw new Error("Значение R должно быть положительным");
    }
    return 2 * Math.PI * r;
}
function task2981(r){
    if (r <= 0){
        throw new Error("Значение R должно быть положительным");
    }
    return 4 * Math.PI * r * r * r / 3;
}
function task4312(a,h){
    if (a <= 0){
        throw new Error("Значение A должно быть положительным");
    }
    if (h <= 0){
        throw new Error("Значение H должно быть положительным");
    }
    return a * h / 2;
}
function task8428(a){
    return a * Math.PI/180;
}
function task2361(t,l){
    if (t <= 0){
        throw new Error("Значение T должно быть положительным");
    }
    if (l <= 0){
        throw new Error("Значение L должно быть положительным");
    }
    t = parseInt(t) * 100;
    l = parseInt(l);
    return {
        q: Math.floor(t/l),
        d: t%l
    };
}
function task5063(a){
    return parseInt(a)%360;
}
function task7711(x){
    return Math.sin(x*Math.PI/180);
}
function task8833(x){
    if (x < 0){
        throw new Error("Значение X должно быть неотрицательным");
    }
    return Math.sqrt(x);
}
function task1262(y){
    return 5 * Math.cos(y * Math.PI/180);
}
function task9020(x){
    if (x > 61){
        throw new Error("Подкоренное выражение должно быть неотрицательным");
    }
    return 3 * Math.sqrt(61-x);
}
function task1934(a,b){
    if (b > 0){
        throw new Error("Значение B должно быть не положительным");
    }
    return a*Math.sqrt(-7*b);
}
function task7237(tc){
    if (tc < -273.15){
        throw new Error("Значение T должно быть выше абсолютного нуля");
    }
    return tc * 1.8 + 32;
}
function task3943(x,y){
    if (y < 0){
        throw new Error("Значение y должно быть неотрицательным");
    }
    var t = parseInt(x) + Math.sqrt(y);
    if (t < 0){
        throw new Error("Подкоренное выражение должно быть неотрицательным");
    }
    return -5 * Math.sqrt(t);
}
function task7619(v1, v2, s){
    if (v1 < 0 || v2 < 0){
        throw new Error("Скорость должна быть неотрицательна");
    }
    if (s < 0){
        throw new Error("Расстояние должно быть неотрицательным");
    }
    return parseInt(s)/(parseInt(v1)+parseInt(v2));
}
function task3832(x1,x2,x3){
    return x1*x2+x1*x3+x2*x3;
}
function task1346(v0,t,a){
    return v0*t+a*t*t/2;
}
function task9622(m,v,h){
    if (m < 0){
        throw new Error("Значение M должно быть положительным");
    }
    if (v < 0){
        throw new Error("Значение V должно быть положительным");
    }
    if (h < 0){
        throw new Error("Значение H должно быть неотрицательным");
    }
    return {
        t: m*v*v/2,
        wn: m*h*9.8067
    };
}
function task8873(r1, r2){
    if (r1 == 0){
        throw new Error("Значение r1 должно быть не равно нулю");
    }
    if (r2 == 0){
        throw new Error("Значение r2 должно быть не равно нулю");
    }
    return 1/r1 + 1/r2;
}
function task7799(m,a){
    if (m <= 0)
    {
        throw new Error("Масса должна быть положительной");
    }
    var g = 9.8067;
    if (a >= 90)
    {
        return 0;
    }
    return m*g*Math.cos(a*Math.PI/180);
}
function task9354(a,b,c){
    if (a == 0){
        throw new Error("Уравнение " + a + "x^2+" + b + "x + " + c + " не является квадратным.");
    }
    return b*b-4*a*c;
}
function task9130(mass1,mass2,distance){
    if (distance <= 0){
        throw new Error("Дистанция должна быть положительна");
    }
    if (mass1 <= 0){
        throw new Error("Масса должна быть положительна");
    }
    if (mass2 <= 0){
        throw new Error("Масса должна быть положительна");
    }
    var g = 9.8067;
    return g*mass1*mass2/distance/distance;
}
function task5895(a,b,c){
    return Math.sqrt(a*a+b*b-2*a*b*Math.cos(c*Math.PI/180));
}
function task2461(a,b,c,d){
    if (a == 0){
        throw new Error("Значение a должно быть не равно нулю");
    }
    if (d == 0){
        throw new Error("Значение d должно быть не равно нулю");
    }
    return (a*d+b*c)/a/d;
}
function task2790(x) {
    var s = Math.sin(x * Math.PI / 180);
    return Math.sqrt(1-s*s);
}
function task2624(a,b,c,x){
    var root = a * x * x + b * x + parseInt(c);
    if (root < 0){
        throw new Error("Подкоренное выражение должно быть неотрицательным");
    }
    if (root == 0){
        throw new Error("Знаменатель не может быть равен нулю");
    }
    return 1/Math.sqrt(root);
}
function task5871(x){
    if (x < 1){
        throw new Error("Значение X должно быть не меньше 1");
    }
    x = parseInt(x);
    return (Math.sqrt(x+1)+Math.sqrt(x-1))/2/Math.sqrt(x);
}
function task9164(a,b){
    a = a * Math.PI/180;
    b = b * Math.PI/180;
    return Math.sin(a)*Math.cos(b)+Math.cos(a)*Math.sin(b);
}
function task7457(x){
    return 7*x*x-3*x+6;
}
function task9865(a){
    return 12*a*a+7*a-16;
}
function task3591(h){
    if (h < 0){
        throw new Error("Высота над уровнем Земли должна быть неотрицательна");
    }
    h = parseInt(h);
    var r = 6350;
    var c = r+h;
    return Math.sqrt(c*c-r*r);
}
function task3558(a,b){
    var alpha = 2*a*Math.PI/180;
    var beta = 3*b*Math.PI/180;
    return 3*Math.sin(alpha)*Math.cos(beta);
}
function task4366(x1,x2){
    return Math.sqrt(x2*x2+x1*x1);
}
function task5789(xa,ya,xb,yb){
    var dx = xb-xa;
    var dy = yb-ya;
    return Math.sqrt(dx*dx+dy*dy);
}
function task6522(v1, t1, v2, t2){
    if (v1 < 0){
        throw new Error("Значение v1 должно быть неотрицательным");
    }
    if (v2 < 0){
        throw new Error("Значение v2 должно быть неотрицательным");
    }
    v1 = parseInt(v1);
    v2 = parseInt(v2);
    t1 = parseFloat(t1);
    t2 = parseFloat(t2);
    var v = v1+v2;
    return {
        volume:v,
        temperature:(t1*v1+t2*v2)/v
    };
}
function task5870(timeInSeconds){
    if (timeInSeconds < 0){
        throw new Error("Количество времени должно быть неотрицательным");
    }
    var h = Math.floor(timeInSeconds/3600);
    var m = Math.floor(timeInSeconds/60%60);
    var s = timeInSeconds%60;
    return h + " часов " + m + " минут " + s + " секунд";
}