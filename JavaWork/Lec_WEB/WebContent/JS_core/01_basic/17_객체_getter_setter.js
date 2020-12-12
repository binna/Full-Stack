/* object 의 getter, setter

getter 함수: 특정 값을 조회할때마다
setter 함수: 특정 값을 설정할때마다

https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Functions/get

ES 5.1 에 최초 정의
https://www.ecma-international.org/ecma-262/5.1/#sec-11.1.5

ES 6 에서 계산된 프로퍼티 이름이 추가
https://www.ecma-international.org/ecma-262/6.0/#sec-method-definitions


JS 에서 매우 유용

*/

const numbers = {
    a : 1
    , b : 2

    // getter 함수, 키워드명이 get임..!
    , get sum(){
        // get 키워드로 시작...!
        console.log("sum 함수가 실행됩니다!");
        // 반.드.시 무엇인가를 리턴해주어야 한다.
        return this.a + this.b;
        // return 이 빠지면 undefined 리턴.
    }
}

// 그럼 getter는 어캐 호출할까?
// getter함수는 아래와 같이 '조회' 하려 할때
// 함수가 호출, 실행됩니다.
//console.log(numbers.sum()); // 에러 : TypeError: numbers.sum is not a function

// getter함수는 아래와 같이 호출해야 호출 가능함...!!
console.log(numbers.sum);

numbers.b = 5
console.log(numbers.sum);

// setter 함수
const dog = {
    _name : "멍멍이"

    // setter
    // 키워드명이 set, set 키워드로 시작
    , set name(value){
        // 반드시 parameter 설정되어 있어야 함!
        console.log("이름이 바뀝니다: " + value);
        this._name = value;
    }
}
console.log();
console.log(dog._name);

//dog.name('뽀삐');   // 에러 : TypeError: dog.name is not a function
// 함수처럼 하지말고 그냥 넣어라..!!
dog.name = '뽀삐';  // setter name() 호출

console.log(dog._name);
console.log('---------------------------------------------------');

const numbers2 = {
    _a : 1
    , _b : 2
    , sum : function() {
        return this._a + this._b;
    }
}
console.log(numbers2.sum());
numbers2._a = 10; numbers2._b = 20;
console.log(numbers2.sum());
console.log(numbers2.sum());


// 성능은 위의 코드보다는 아래의 코드가 좋음
// 함수를 어떻게 구성하느냐에 따라 성능의 차이가 있을 수 있음..!
const numbers3 = {
    _a : 1
    , _b : 2
    , sum : 3
    , get a() {return this._a}
    , get b() {return this._b}
    , set a(value) {
        this._a = value;
        this.sum = this._a + this._b;
    }
    ,set b(value) {
        this._b = value;
        this.sum = this._a + this._b;
    }
}
console.log('---------------------------------------------------');
console.log(numbers3.sum);
numbers3.a = 10;    // setter 동작 + 연산 발생
numbers3.b = 20;    // setter 동작 + 연산 발생
console.log(numbers3.sum);  // 여러 번 조회해도 이미 연산된 결과 값만 보여줌, 재계산 안함
console.log(numbers3.sum);