import {Stack,Badge,Avatar,IconButton,InputGroup,Input,Popover,Dropdown,Whisper,List,Button} from 'rsuite'
import NoticeIcon from '@rsuite/icons/Notice';
import HeartIcon from '@rsuite/icons/legacy/HeartO';
import SearchIcon from '@rsuite/icons/Search';
import HelpOutlineIcon from '@rsuite/icons/HelpOutline';
import { Icon } from '@rsuite/icons';
import { MdOutlineNightlight, MdOutlineLightMode } from 'react-icons/md';
import { useState } from 'react';
import { Link } from 'react-router-dom';
const styles = {
  width: 250,
  marginRight:20
};


const renderAdminSpeaker = ({ onClose, left, top, className },ref) => {
  const handleSelect = eventKey => {
    onClose();
    console.log(eventKey);
  };
  return (
    <Popover ref={ref} className={className} style={{ left, top }} full>
      <Dropdown.Menu onSelect={handleSelect}>
        <Dropdown.Item panel style={{ padding: 6, width: 160 }}>
          <p>Signed in as</p>
          <strong>Administrator</strong>
        </Dropdown.Item>
        <Dropdown.Item divider />
        <Dropdown.Item><Link to='/Profile' style={{textDecoration:'none',color: 'inherit'}}>Profile & account</Link></Dropdown.Item>
        <Dropdown.Item>Feedback</Dropdown.Item>
        <Dropdown.Item divider />
        <Dropdown.Item><Link to='/' style={{textDecoration:'none',color: 'inherit'}}>Sign out</Link></Dropdown.Item>
        <Dropdown.Item
          icon={<HelpOutlineIcon />}
        >
          Help{' '}
        </Dropdown.Item>
      </Dropdown.Menu>
    </Popover>
  );
};

const renderNoticeSpeaker = ({ onClose, left, top, className }, ref) => {
  const notifications = [
    [
      '7 hours ago',
      'The charts of the dashboard have been fully upgraded and are more visually pleasing.'
    ],
    [
      '13 hours ago',
      'The function of virtualizing large lists has been added, and the style of the list can be customized as required.'
    ],
    ['2 days ago', 'Upgraded React 18 and Webpack 5.'],
    [
      '3 days ago',
      'Upgraded React Suite 5 to support TypeScript, which is more concise and efficient.'
    ]
  ];

  return (
    <Popover ref={ref} className={className} style={{ left, top, width: 300 }} title="Last updates">
      <List>
        {notifications.map((item, index) => {
          const [time, content] = item;
          return (
            <List.Item key={index} style={{padding:'1vh'}}>
              <Stack spacing={6}>
                <Badge color='blue' /> <span style={{ color: '#57606a' }}>{time}</span>
              </Stack>

              <p>{content}</p>
            </List.Item>
          );
        })}
      </List>
      <div style={{ textAlign: 'center', marginTop: 15 }}>
        <Button onClick={onClose}>More notifications</Button>
      </div>
    </Popover>
  );
};

const NavigationBar = () => {
  const { theme, onChangeTheme } = useState('dark');
    return (
      <div style={{ display:'flex',justifyContent:'end',background:'#F4F8FA',height:'7vh',marginRight:'2vh'}}>
      <Stack spacing={8}>
      <InputGroup  style={styles}>
      <Input />
      <InputGroup.Button>
        <SearchIcon />
      </InputGroup.Button>
    </InputGroup>
        <IconButton
          icon={<HeartIcon style={{ fontSize: 25 }} color="red" />}
          target="_blank"
        />
        <IconButton
          icon={
            <Icon
              as={theme === 'light' ? MdOutlineNightlight : MdOutlineLightMode}
              style={{ fontSize: 25 }}
            />
          }
          onClick={() => onChangeTheme(theme === 'dark' ? 'light' : 'dark')}
        />
        <Whisper placement="bottomEnd" trigger="click" speaker={renderNoticeSpeaker}>
          <IconButton
            icon={
              <Badge content={5} color='blue'>
                <NoticeIcon style={{ fontSize: 25 }} />
              </Badge>
            }
          />
          </Whisper>
           <Whisper placement="bottomEnd" trigger="click" speaker={renderAdminSpeaker}>
          <Avatar
            size="md"
            circle
            src="https://avatars.githubusercontent.com/u/1203827"
            alt="@simonguo"
            style={{ marginLeft: 8 }}
          />
          </Whisper>
      </Stack>
      </div>
  );
};

export default NavigationBar;