// addr에서 파라미터 부분만 가져오기
// searchParams 속성을 호출하면 파라미터 부분에 해당하는 객체를 리턴
const address = new URL("https://www.naver.com/login?id=ggangpae1");
console.log(address.searchParams);

// id 값 추출하기
console.log(address.searchParams.get("id"));