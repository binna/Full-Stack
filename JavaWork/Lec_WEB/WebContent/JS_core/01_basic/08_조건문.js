// if ~ else
// if ~ else if ~ else ...
// JAVA, C 언어와 구조 동일

a = 100

if(a + 1 > 100) {   // 참 판정
    // 에러 : Cannot access 'a' before initialization
    // 13번째 줄에서 a 선언할때 var로 선언했다면 100의 값이 출력되었을 것임
    // 왜냐하면 let은 hoisting 이 안되기 때문에...!!
    //console.log('if 안의 a 값은', a);

    let a = 10;
    console.log('if 안의 a 값은', a);   // 출력 값은 10
}


// 조건식에서 참 거짓 판정

// Falsy 로 평가될때! (거짓으로 판정된다는 의미)
// false, 0, '', null, undefined, NaN   <-- 'Falsy 한 값'이라 한다

// Truthy 로 평가될때! (참으로 판정된다는 의미)
// true, 37, 'Mark', {}, []   <-- 'Truthy 한 값' 이라 한다
// 파이썬과 달리 자바스크립트는 {}, []을 참으로 받아들임...!!!!


// 자바스크립트의 함수는 리턴타입 명시 안해도 됨..!!
function print(data) {
    
    if(data) {  // 참(Truthy) 거짓(Falsy) 판정
        console.log(data, typeof data, '-- Truthy');
    } else {
        console.log(data, typeof data, '-- Falsy')
    }
}

// 자바스크립트는 매개변수가 생성자 역할을 함..!!

print(true)
print(false)
print(0)            // F
print(-1)           // T
print('hello')      // T
print('')           // F
print([10, 20, 30]) // T
print([])           // T, [중요] 파이썬과 반대로 출력
print({'name' : 'John', 'age' : 32})    // T
print({})           // T, [중요] 파이썬과 반대로 출력
print(null)         // F
print(undefined)    // F
print(NaN)          // F
console.log(100/0)  // Infinity 출력
print(100/0)        // T

print() // 호출시 전달인자 없으면 undefined 값으로 동작함
        // 파이썬과 자바에서는 이런 경우는 짤업이 에러..!

console.log()
// Falsy 값에 ! 결과 -> true (boolean)
console.log(!undefined)
console.log(!null)
console.log(!0)
console.log(!"")
console.log(!NaN)

// Truthy 값에 ! 결과 -> false (boolean)
console.log(!3)
console.log(!"Hello")
console.log(!" ")
console.log(![10, 20, 30])
console.log(![])
console.log(!{})

// Truthy, Falsy 판정 결과 -> boolean
// 1. 삼항연산자 사용
let value = {'a' : 100}
let isTrue = value ? true : false;

console.log('isTrue =', isTrue, typeof isTrue)

// 2. !! 사용하면 가능
ifTrue = !!value;
console.log('isTrue =', isTrue, typeof isTrue)

console.log()

// 함수 정의할 때 매개변수 체크 필요..!!
function printName(person) {

    // 매개변수 체크 null check
    //if(person === undefined || person === null) {return;}
    if(!person) {return;} // 간단하게 해결..!!

    console.log('이름은', person.name)
}

let myBrother = {name : "John"}

printName(myBrother)

// 에러 : TypeError: Cannot read property 'name' of undefined
// 함수 내에 매개변수 not null을 체크하여 에러나지 않도록 코딩 가능
printName()   