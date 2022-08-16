document.getElementById('one').innerHTML = 'hi world';
console.log('hello!!!!!!!!!!!!!!');

/* var,let,const 비교 */
var x = 10;
var y = 20;
console.log(x + y);

/* 두번째 선언 
- 다른 언어에서는 인정되지 않고, 에러 발생 (서로 변수가 혼용될수 있기 때문)
- S/W 개발시 개발자A가 사용하는 x가 개발자B가 사용하는 x에 영향을 끼치면 안됨 (문제 발생)
*/
var x = 10;
var y = 20;
console.log(x + y);

/* let사용시 중복 선언하면 에러 발생 */
let c = 30;
let d = 40;
console.log(c + d);

// 에러 발생
let c = 30;
let d = 40;
console.log(c + d);
