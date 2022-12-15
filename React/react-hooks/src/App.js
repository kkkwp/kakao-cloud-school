import React from 'react';
import UserList from './UserList';

const App = () => {
  const users = [
    { id: 1, username: 'karina', email: 'karina@gmail.com' },
    { id: 2, username: 'winter', email: 'winter@naver.com' }
  ]

  return (
    <div>
      <UserList users={users} />
    </div>
  )
}

export default App;