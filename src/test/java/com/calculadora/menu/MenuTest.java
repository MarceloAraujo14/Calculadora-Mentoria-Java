package com.calculadora.menu;

import com.calculadora.util.ReadUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mockStatic;

@ExtendWith(MockitoExtension.class)
class MenuTest {
    Menu menu = new Menu();

    @Test
    void deveMostarOMenuPrincipalESair(){
        mockStatic(ReadUtil.class).when(ReadUtil::readOption).thenReturn(4);
        menu.run();
        assertEquals(MenuMain.class, menu.activeMenu.getClass());
    }
}