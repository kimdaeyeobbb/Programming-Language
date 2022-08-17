console.log(add1(10, 30)); // 호이스팅

function add1(x, y) {
  return x + y;
}

console.log(add1(50, 100));

let add2 = function (x, y) {
  // 함수 표현식은 호이스팅 불가
  // 일시적 사각지대에 빠지므로 표현불가
  return x + y;
};

console.log(add2(100, 200));
