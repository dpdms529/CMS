import {Col, Container, Nav, Navbar} from 'react-bootstrap';

function Header() {
  return (
    <Navbar bg='dark' variant='dark'>
        <Container>
            <Navbar.Brand href="/">💻 CMS</Navbar.Brand>
            <Col></Col>
            <Nav className="me-auto">
              <Nav.Link href="/manage">이수과목관리</Nav.Link>
              <Nav.Link href="/simulation">졸업시뮬레이션</Nav.Link>
              <Nav.Link href="/login">로그인</Nav.Link>
            </Nav>
        </Container>
    </Navbar>
  );
}

export default Header;