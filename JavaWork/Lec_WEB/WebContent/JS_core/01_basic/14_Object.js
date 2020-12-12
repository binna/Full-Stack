// object
console.log('object');

// object는 {}로 감싼다..!!
// property : value 쌍
x = {firstName : "John", lastName : "Doe"};
console.log(x, typeof x)

// value 접근하는 방법
console.log(x['firstName'], x.firstName, typeof x.firstName);
//console.log(x[firstName]);  // 에러 : firstName is not defined

// object 는 length 값 없다.
console.log(x.length);

// for ~ in
for(key in x) { // property 가 추출됨 (string)
    console.log(`x[${key}] = ${x[key]}`);
}

// value 는 어떠한 타입이라도 가능!
x = {
    // 이런식으로 코드 작성하는건 좋은 습관...!!
    name : "kim"
    , age : 34
    , height : 172.3
    , score : [94, 35, 79]
    , sayHello : function() {
        console.log('안냐하세용~')
    }
    , getScore : function(n) {
        // this 빼면 에러!
        // 동일 object내 property 접근할때 this 사용!
        return this.score[n];
    }
    , getTotal : function() {
        var sum = 0;
        for(i = 0; i < this.score.length; i++) {
            sum += this.score[i];
        }
        return sum
    }
    , getAvg : function() {
        var avg = this.getTotal() / this.score.length;
        return avg.toFixed(2);  // 소수점 2자리까지
    }
};

console.log(x['name'], typeof x['name']);
console.log(x['age'], typeof x['age']);
console.log(x.height, typeof x.height);
console.log(x.score, x.score.length);
x.sayHello();
console.log(x.getScore(0));
console.log(x.getTotal());
console.log(x.getAvg());
console.log(x['getAvg']()); // 이런 식으로도 접근 가능...!!

console.log()

// p : v 추가 / 삭제 / 변경
x = {firstName : "John", lastName : "Doe"};
console.log(x);
x.firstName = "Make"    // 변경
console.log(x);

x['age'] = 45;  // 없던 property 추가
console.log(x);

delete x.firstName;
console.log(x);

// 없는 property 접근하려 하면
console.log(x.firstName);   // undefined 출력

// ------------------------------------------
//console.log(a); // 에러 : ReferenceError: a is not defined
var b;
console.log(b);

// a는 에러나오고 b는 undefined 나오는 이유는
// a는 존재 자체가 없는 것이고 b는 존재하는데 초기값 설정을 해주지 않았기 때문

b='김재현';
console.log(b);

// 위의 내용의 못 다룬 부분은 html 배우면서 상세하게 다룰 예정

// '함수'가 'object 생성자'로 사용 가능...!!
function Person(firstName, lastName, age) {
    // 함수 안에서 느닷없이 this...?
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;

    //console.log(this);
}

Person('aaa', 'bbb', 30);   // 호출

// JS는 클래스가 없다는 점을 명심하기!
var p1 = new Person('aaa', 'bbb', 30);  // 생성자로 동작
console.log(p1);
var p2 = new Person('김', '재현' , 25);
console.log(p2);