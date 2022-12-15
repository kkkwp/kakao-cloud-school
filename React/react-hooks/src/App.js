import React from 'react';
import { useState, useRef, useMemo } from 'react';

import UserList from './UserList';
import CreateUser from './CreateUser';

// active가 true인 데이터의 개수
const countActiveUser = (users) => {
  console.log("사용자 수를 세기");
  return users.filter(user => user.active).length;
}

const App = () => {
  const [inputs, setInputs] = useState({
    username: '',
    email: ''
  });
  const { username, email } = inputs;

  const onChange = (e) => {
    // state를 수정할 때는 원본을 복제한 후 수정
    setInputs({
      ...inputs,
      [e.target.name]: e.target.value
    });
  }

  // 배열의 데이터를 수정하면 컴포넌트가 리랜더링 될 수 있도록 state로 생성
  const [users, setUsers] = useState([
    { id: 1, username: 'karina', email: 'karina@gmail.com', active: false },
    { id: 2, username: 'winter', email: 'winter@naver.com', active: true },
    { id: 3, username: 'ningning', email: 'ningning@sm.com', active: true },
  ]);

  // 변수 생성
  const nextId = useRef(4);

  // 데이터 삽입 함수
  const onCreate = () => {
    // 하나의 객체 생성
    const user = {
      id: nextId.current,
      username,
      email
    }
    // users에 user를 추가
    setUsers([...users, user]);

    // 입력 요소 초기화
    setInputs({
      username: '',
      email: ''
    })

    // 다음 id를 위해서 id를 1 증가
    nextId.current += 1;
  }

  // 데이터 삭제 함수
  // users state에서 id가 id인 데이터 삭제
  // id가 일치하지 않는 데이터만 삭제
  // 실제로는 id가 일치하지 않는 데이터만 가지고 배열을 만들어서 수정한다.
  const onRemove = (id) =>
    setUsers(users.filter(user => user.id !== id));

  // 데이터 수정 함수
  // id에 해당하는 데이터의 active 속성의 값을 반전
  const onToggle = (id) =>
    setUsers(users.map(user => user.id === id
      ? { ...user, active: !user.active }
      : user));

  // 활성화된 user 개수를 세는 함수 호출
  // users에 변화가 생긴 경우만 함수를 호출하고 그 이외의 경우는 결과를 복사하도록 수정
  const count = useMemo(() => countActiveUser(users), [users]);

  return (
    <div>
      <CreateUser
        username={username}
        email={email}
        onChange={onChange}
        onCreate={onCreate} />
      <UserList
        users={users}
        onRemove={onRemove}
        onToggle={onToggle} />
      <div>활성화된 유저 수: {count}</div>
    </div>
  )
}

export default App;