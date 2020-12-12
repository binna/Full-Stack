// 변수의 유효범위
// scope

// const, let 의 유효범위
//  ==> Block Scope
//    { ... }

// 블럭
{
    const name = 'Mark' // 블럭 안에서만 사용 가능
    console.log(`name = ${name}`)
}
// 에러 : ReferenceError: name is not defined
// 블럭 밖에서 사용하려 하면 에러!
//console.log(`name = ${name}`)

{
    // 에러 : ReferenceError: Cannot access 'name2' before initialization
    //console.log('name2 = ', name2)
    const name2 = 'Mark'
}

{
    // 이 블록 안의 예시를 통해
    // 변수의 유효범위는 Block Scope라는 것을 알 수 있음..!!
    
    console.log('value1 = ', value1);   // 에러는 아니다, undefined이 나올뿐
    var value1 = 200;

    // 에러 : ReferenceError: value2 is not defined
    // 선언된 적이 없다는 에러 발생..!!
    //console.log('value2 = ', value2);
}

// Hoisting
// https://developer.mozilla.org/ko/docs/Glossary/Hoisting

// 이러한 현상을 hoisting 이라 하는데
// hoisting 현상은 함수에서만 발생하는게 아니다.

// hoising 
// 아래에 있는 선언을(만) 끌어올린다.

// hoising 때문에 동작의 오류처럼 보이는 증상 겪게 됨

// hoising 현상은 처음부터 있었으나
// 용어 자체는 ES2015 및 그 이전에는 사용되지 않음

{
    // nick is not defined 에러였으나
    // 59번째 줄 var nick = '아이언맨';를 추가하면
    // undefined으로 출력됨
    console.log(`nick=${nick}`);    // 2. 가 hoisting 됨

    // 자바 스크립트에서는 선언문 없이 변수 선언이 가능함..!!
    nick = 'Mighty';    // 1. 
    console.log(`nick=${nick}`);    // 1.

    var nick = '아이언맨';  // 2.

    // 1. nick 과 2. nick 은 변수 scope 가 다르다
}

age = 6;
age++;
console.log("1. age=", age);

{
    console.log(`2. age = ${age}`) // 블록 바깥쪽 scope 의 변수 사용 가능.
    age = 30
    console.log(`3. age = ${age}`)

    //let age;    // var age;일때는 동작했으나, 
                  // let 은 hoisting 이 발생 안한다.
}

console.log(`4. age = ${age}`)