import { Container, Header, Content,} from 'rsuite';
import NavigationBar from '../../components/NavigationBar';
import Dashboard from './AdminDashboard';
import AdminSidenavigationBar from '../../components/AdminSidenavigationBar';
const Admin = () => {
    return (
        <div className="show-fake-browser sidebar-page" style={{ background: "#F4F8FA",}}>
        <Container>
          <AdminSidenavigationBar></AdminSidenavigationBar>
          <Container>
            <Header>
              <NavigationBar></NavigationBar>
            </Header>
  
            <Content>
              <Dashboard/>
            </Content>
          </Container>
        </Container>
      </div>
    );
};

export default Admin;