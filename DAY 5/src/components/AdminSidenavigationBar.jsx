import React from 'react'
import { Sidenav, Nav, Sidebar,DOMHelper} from 'rsuite';
import DashboardIcon from '@rsuite/icons/legacy/Dashboard';
// import GroupIcon from '@rsuite/icons/legacy/Group';
import MagicIcon from '@rsuite/icons/legacy/Magic';
import GearCircleIcon from '@rsuite/icons/legacy/GearCircle';
import ExploreIcon from '@rsuite/icons/Explore';
import { Link } from 'react-router-dom';


const { getHeight, on } = DOMHelper;


const AdminSidenavigationBar = () => {
    const [expanded, setExpanded] = React.useState(true);
    const [activeKey, setActiveKey] = React.useState('1');
    const [windowHeight, setWindowHeight] = React.useState(getHeight(window));

    React.useEffect(() => {
      setWindowHeight(getHeight(window));
      const resizeListenner = on(window, "resize", () =>
        setWindowHeight(getHeight(window))
      );
  
      return () => {
        resizeListenner.off();
      };
    }, []);
    const navBodyStyle = expanded
      ? { height: windowHeight - 70, overflow: "auto" }
      : {height: windowHeight - 70, overflow: "auto" };
    return (
      <Sidebar style={{ display: 'flex', flexDirection: 'column' ,background:"white"}}  width={expanded ? 260 : 56} collapsible>
        <Sidenav expanded={expanded} appearance="subtle" defaultOpenKeys={['3', '4']}>
          <Sidenav.Body style={navBodyStyle}>
            <Nav activeKey={activeKey} onSelect={setActiveKey} style={{top:'3vh'}}>
              <Nav.Item eventKey="1" icon={<DashboardIcon />}>
              <Link to='/Admin' style={{textDecoration:'none',color: 'inherit'}}>
                DashBoard
              </Link>
              </Nav.Item>
              <Nav.Item eventKey="2" icon={<ExploreIcon />}>
                <Link to='/AdminEvents' style={{textDecoration:'none',color: 'inherit'}}>
              Your Events
              </Link>
              </Nav.Item>
              <Nav.Item placement="rightStart" eventKey="3" icon={<MagicIcon />}>
              <Link to='/AddEvent' style={{textDecoration:'none',color: 'inherit'}}>
                Add Events
              </Link>
              </Nav.Item>
              <Nav.Item
                placement="rightStart"
                eventKey="4"
                icon={<GearCircleIcon />}
                
              >
                Manage Events
                </Nav.Item>
            </Nav>
          </Sidenav.Body>
          <Sidenav.Toggle onToggle={expanded => setExpanded(expanded)} />
        </Sidenav>
      </Sidebar>
    );
};

export default AdminSidenavigationBar;