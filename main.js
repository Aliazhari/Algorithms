import React, {useEffect} from 'react';
import { Linking,TouchableOpacity, View, Image,StatusBar,Item, StyleSheet } from 'react-native';
//import { baseProps } from 'react-native-gesture-handler/lib/typescript/handlers/gestureHandlers';
import { Menu, Divider, Provider } from 'react-native-paper';
import  Icon from "react-native-vector-icons/Feather";
import { NavigationContainer} from '@react-navigation/native';
import { createStackNavigator } from '@react-navigation/stack';
import { DrawerNavigator, StackNavigator } from 'react-navigation';



const CustomMenu = ({navigation}) => {
    const [showMenu, setShowMenu] = React.useState(false);

    
    // useEffect(() => {
    //   navigation.setOptions({
    // headerShown:false
    // });
    // }, []);
  

    

    return (
      
       
      <View style={{}}>
        <Menu
          visible={showMenu}
          onDismiss={() => setShowMenu(false)}
          anchor={
            <TouchableOpacity onPress={() => setShowMenu(true)}>
            <Icon name="more-vertical" color="white" size={25}/>
            </TouchableOpacity>
          }>


      {/* Menu hamberger it does't work with On press .Please see bellow I used navigation but doesn't work */}
          <Menu.Item 
          style={styles.menuitem1}  title="WebPage"
          onPress={() => navigation.navigate('Root', { screen: 'WebPage' })} />
          
          <Menu.Item 
          style={styles.menuitem1} title="Description"
          onPress={() => {}} />
          <Divider />
          <Menu.Item
          style={styles.menuitem1} title="ImageBackground1"
          onPress={() => {}}  />
          <Menu.Item
          style={styles.menuitem1} title="ImageBackground2" 
          onPress={() => {}} />
          <Menu.Item
          style={styles.menuitem1} title="ImageBackground3"
          onPress={() => {}} />


{/* <Menu.Item 
          style={styles.menuitem1}  title="WebPage"
          onPress={() => navigation.navigate("WebPage")}  />
          
          <Menu.Item 
          style={styles.menuitem1} title="Description"
          onPress={() => navigation.navigate("Description")}  />
          <Divider />
          <Menu.Item
          style={styles.menuitem1} title="ImageBackground1"
          onPress={() => navigation.navigate("ImageBackground1")}  />
          <Menu.Item
          style={styles.menuitem1} title="ImageBackground2" 
          onPress={() => navigation.navigate("ImageBackground2")} />
          <Menu.Item
          style={styles.menuitem1} title="ImageBackground3"
          onPress={() => navigation.navigate("ImageBackground3")} />
*/}
           
      
        </Menu>
      </View>
   
    )
  };

  export default CustomMenu;

const styles = StyleSheet.create({
    container: {
      paddingTop: 50,
      backgroundColor: "#000080"
    },
    menuitem1: {
        backgroundColor: "#e6e6ff"
      }
    
  });