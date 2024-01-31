import { Container, Header, Content,} from 'rsuite';
import AdminSidenavigationBar from '../components/AdminSidenavigationBar';
import NavigationBar from '../components/NavigationBar';
import YourEventsCard from './YourEventsCard';


const YourEvent = () => {
    return (
        <div className="show-fake-browser sidebar-page" style={{ background: "#F4F8FA",}}>
      <Container>
      <AdminSidenavigationBar></AdminSidenavigationBar>
        <Container>
          <Header>
            <NavigationBar></NavigationBar>
          </Header>

          <Content>
            <YourEventsCard/>
          </Content>
        </Container>
      </Container>
    </div>
    );
};

export default YourEvent;