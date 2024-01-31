import { Container, Header, Content,} from 'rsuite';
import SidenavigationBar from '../components/SidenavigationBar';
import NavigationBar from '../components/NavigationBar';
import Profile from './Profile';

const Profilepage = () => {
    return (
        <div className="show-fake-browser sidebar-page" style={{ background: "#F4F8FA",}}>
      <Container>
        <SidenavigationBar></SidenavigationBar>
        <Container>
          <Header>
            <NavigationBar></NavigationBar>
          </Header>

          <Content>
            <Profile/>
          </Content>
        </Container>
      </Container>
    </div>
    );
};

export default Profilepage;