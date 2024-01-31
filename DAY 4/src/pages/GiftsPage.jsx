import { Container, Header, Content} from 'rsuite';
import SidenavigationBar from '../components/SidenavigationBar';
import NavigationBar from '../components/NavigationBar';
import Gifts from './GiftsCards';

const GiftsPage = () => {
    return (
        <div style={{ background: "#F4F8FA",}}>
      <Container>
        <SidenavigationBar></SidenavigationBar>
        <Container>
          <Header>
            <NavigationBar></NavigationBar>
          </Header>

          <Content>
            <Gifts/>
          </Content>
        </Container>
      </Container>
    </div>
    );
};

export default GiftsPage;