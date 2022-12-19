import { Routes, Route } from 'react-router-dom';
import About from './About';
import Home from './Home';
import Profile from './Profile';

import Article from './Article';
import Articles from './Articles';
import Layout from './Layout';

function App() {
  return (
    <Routes>
      <Route element={<Layout />}>
        <Route path='/' element={<Home />} />
        <Route path='/about' element={<About />} />
        <Route path='/profile/:username' element={<Profile />} />
      </Route>
      <Route path='/articles' element={<Articles />}>
        <Route path=':id' element={<Article />} />
      </Route>
    </Routes>
  );
}

export default App;
