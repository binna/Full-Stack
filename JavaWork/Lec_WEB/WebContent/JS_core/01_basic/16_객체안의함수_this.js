const dog = {
    name : "멍멍이"
    , sound : "멍멍!"

    // 객체 안의 함수 정의하는 방법..!!

    // 방법1
    , say1 : function aaa() {
        console.log(this.sound);    // this는 함수가 위치한(소유한) 객체
    }

    // 방법2 : 이름 없는 함수..!!
    , say2 : function() {
        console.log(this.sound);
    }

    // 방법3 : 최신 JS 방식 (추천하나 웹에서는 사용은 왠만하면 지양!)
    // 최신 방식이라 많은 브라우저들이 지원을 안함..!!
    , say3() {
        console.log(this.sound);
    }

    // 화살표 함수의 경우... this가 문제
    , say4 : () => {
        console.log(this.sound);    // 출력 : undefined
        // 이유?
        // function 키워드로 만든 함수에서의 this는
        // 자기가 속해있는, 객체를 가리키는데..
        // 화살표 함수의 경우
        // this를 자기가 속해 있는 곳으로
        // 연결하지 않습니다.
        // 화살표 함수는 this 가 뭔지 모릅니다!
    } 
}


dog.say1();

// TypeError: dog.aaa is not a function
//dog.aaa(); // 에러, aaa 함수를 만든 것이 아님..!!

dog.say2();
dog.say3();
dog.say4();


const cat = {
    name : "야옹이"
    , sound : "냐아~"
}

//cat.say1();   // 에러 : TypeError: cat.say1 is not a function
cat.say1 = dog.say1;

dog.say1();
cat.say1(); // 이때 this 는 cat 이 된다.

const sayCat = cat.say1;
console.log(typeof sayCat); // function
sayCat();   // 출력 : undefined 
            // this 에 아무것도 '연결' 되지 않는다! this 는 undefined!