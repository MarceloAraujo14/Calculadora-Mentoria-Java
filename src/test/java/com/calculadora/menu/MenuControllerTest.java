package com.calculadora.menu;

import com.calculadora.util.ReadUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mockStatic;

@ExtendWith(MockitoExtension.class)
class MenuControllerTest {
    MenuController menuController = new MenuController();

    @Test
    void deveMostarOMenuPrincipalESair(){
        mockStatic(ReadUtil.class).when(ReadUtil::readOption).thenReturn(4);
        menuController.run();
        assertEquals(MenuMain.class, menuController.activeMenu.getClass());
    }

    @Test
    void deveMostarOMenuPrincipalAcessarACalculadoraPadrao(){
        mockStatic(ReadUtil.class).when(ReadUtil::readOption).thenReturn(1);

        menuController.run();
        assertEquals(MenuMain.class, menuController.activeMenu.getClass());
    }
}