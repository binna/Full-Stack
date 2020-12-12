// 논리연산자
// && and 연산자
// || or 연산자
// ! not 연산자

console.log(true && true)
console.log(true && false)
console.log()

let a = 100
console.log(a > 10 || a + 10 < 10)
console.log(a < 10 || a + 10 < 10)
console.log()

console.log(a > 10 && a + 10 < 10)
console.log(a < 10 && a + 10 < 10)
console.log()


// 논리연산자를 이용한 조건문 실행
// Short Circuit Evaluation

// 표현식1 && 표현식2
//  표현식1 이 Falsy 이면 && 의 결과값은 표현식1
//  표현식1 이 Truthy 이면 && 의 결과값은 표현식2

// 표현식1 || 표현식2
//  표현식1 이 Falsy 이면 || 의 결과값은 표현식2
//  표현식1 이 Truthy 이면 || 의 결과값은 표현식1


// 즉, 왼쪽 문자열이 출력되느냐, 오른쪽 문자열이 출력되느냐 결정하는 것..!!


// OR 연산자인 경우, 
// 왼쪽 결과값이 참이면 왼쪽값을 출력
console.log("Hello" || "world")

// OR 연산자인 경우, 
// 왼쪽값이 거짓이고 오른쪽값이 출력
console.log(0 || "world")
console.log()

// AND 연산자,
// 왼쪽값이 참일경우 오른쪽값이 출력
console.log(5 && 100)
console.log(5 && 0)
console.log()

// AND 연산자,
// 왼쪽 값이 거짓이면 왼쪽값이 출력
console.log(null && 'hello')
console.log(100 - 100 && [10, 20, 30])
console.log()

let n = 15;
(n % 5 === 0) && console.log('5의 배수입니다.')

n = 7;
(n % 5 === 0) && console.log('5의 배수가 아닙니다.')