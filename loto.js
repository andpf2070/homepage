
// 내 번호들

// var p1 = 11;
// var p2 = 26;
// var p3 = 16;
// var p4 = 23;
// var p5 = 28;
// var p6 = 36;

var p = [0,0,0,0,0,0]

p[0] = 3;
p[1] = 10;
p[2] = 21;
p[3] = 34;
p[4] = 40;
p[5] = 44;



// 컴 번호

// var r[0],r[1],r[2],r[3],r[4],r[5];

var r = [0,0,0,0,0,0]


// 랜덤 번호

r[0] = Math.floor(Math.random() * 45) + 1;
document.write("랜덤 번호 : ");
document.write(r[0]);
document.write("," + "&nbsp;");


////   r[1] 중복제거


while(true){

    r[1] = Math.floor(Math.random() * 45) + 1;

    if(r[1] != r[0]){
        document.write(r[1]);
        document.write("," + "&nbsp;");
        break;
    }
}

////    r[2] 중복제거

while(true){

    r[2] = Math.floor(Math.random() * 45) + 1;

    if(r[2] != r[0] && r[2] != r[1]){
        document.write(r[2]);
        document.write("," + "&nbsp;");
        break;
    }
}

// r[3] 중복제거

while(true){
    r[3] = Math.floor(Math.random() * 45) + 1;

    if(r[3] != r[0] && r[3] != r[1] && r[3] != r[2]){
        document.write(r[3]);
        document.write("," + "&nbsp;");
        break;
    }
}

// r[4] 중복 제거

while(true){
    r[4] = Math.floor(Math.random() * 45) + 1;

    if(r[4] != r[0] && r[4] != r[1] && r[4] != r[2] && r[4] != r[3]){
        document.write(r[4]);
        document.write("," + "&nbsp;");
        break;
    }
}


// r[5] 중복 제거

while(true){
    r[5] = Math.floor(Math.random() * 45) + 1;

    if(r[5] != r[0] && r[5] != r[1] && r[5] != r[2] && r[5] != r[3] && r[5] != r[4]){
        document.write(r[5]);
        // document.write(" + ");
        document.write("<br>");

        break;
    }
}


// 보너스 번호

var bonus = 0;
while(true){
    bonus = Math.floor(Math.random() * 45) + 1; // 1 ~ n 까지 범위내에서 랜덤하게 숫자 하나 뽑아주는 애.
    if(bonus != r[0] && bonus != r[1] && bonus != r[2] && bonus != r[3] && bonus != r[4] && bonus != r[5]){
        document.write("보너스번호 : " + bonus);
        document.write("<br>");
        break;
    }
}

// 내가 맞춘 수

var win = 0;

for(var i=0; i<=5; i=i+1){
    for(var j=0; j<=5; j=j+1){
        if(p[i] == r[j]){
            win = win + 1;
        }
    }
}


document.write("<br>");
document.write("<hr>");
document.write("<br>");
document.write("플레이어 번호 : "+ p[0] + ", " + p[1] + ", " + p[2] + ", " + p[3] + ", " + p[4] + ", " + p[5]);
document.write("<br>");
document.write("일치한 번호 : " + win);
document.write("<br>");
document.write("당첨 여부 : ")


var s = "";

switch(win){
    case 0 : s = "꽝";
    break;
    case 1 : s = "꽝";
    break;
    case 2 : s = "꽝";
    break;
    case 3 : s = "5등";
    break;
    case 4 : s = "4등";
    break;
    case 5 : s = "3등";
          
        for (var a = 0; a <= 5; a++) {
            if (bonus == r[a]) {
                s = "2등";
            }
        }

    break;
    case 6 : s = "1등";
}

document.write(s);