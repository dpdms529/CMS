import './App.css';
import {Container} from 'react-bootstrap';
import Header from './components/Header';
import Router from './pages/Router';

function App() {
  var _contents = <>
                    <Header></Header>
                    
                    <Container className="App">
                      <Router></Router>
                    </Container>
                  </>

  return (
    _contents
  );
}

export default App;
