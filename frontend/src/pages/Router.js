import {BrowserRouter, Routes, Route} from 'react-router-dom';
import Home from './Home';
import LogIn from './LogIn';
import Manage from './Manage';
import Simulation from './Simulation';

function Router() {
                  
  return (
    <BrowserRouter>
        <Routes>
            <Route path="/" element={<Home></Home>} exact></Route>
            <Route path="manage" element={<Manage></Manage>}></Route>
            <Route path="simulation" element={<Simulation></Simulation>}></Route>
            <Route path="login" element={<LogIn></LogIn>}></Route>
        </Routes>
    </BrowserRouter>
  );
}

export default Router;
