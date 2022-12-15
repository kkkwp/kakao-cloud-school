import React from 'react';
import { useState, useRef } from 'react';

import UserList from './UserList';
import CreateUser from './CreateUser';


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
    { id: 1, username: 'karina', email: 'karina@gmail.com' },
    { id: 2, username: 'winter', email: 'winter@naver.com' }
  ]);

  // 변수 생성
  const nextId = useRef(3);

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

  return (
    <div>
      <CreateUser
        username={username}
        email={email}
        onChange={onChange}
        onCreate={onCreate} />
      <UserList
        users={users}
        onRemove={onRemove} />
    </div>
  )
}

export default App;