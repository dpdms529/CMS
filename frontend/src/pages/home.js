import {Table} from 'react-bootstrap';

function Home() {
    function movePage(page){
        window.location.href = page;
    }

    let _contents = <Table className='Home'>
                        <tbody>
                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                            </tr>
                            <tr>
                                <td colSpan={2} className="content" onClick={() => movePage("manage")}>이수과목관리</td>
                                <td></td>
                                <td colSpan={2} className="content" onClick={() => movePage("simulation")}>졸업시뮬레이션</td>
                            </tr>
                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                            </tr>
                        </tbody>
                    </Table>

    return (
        _contents
    );
}

export default Home;