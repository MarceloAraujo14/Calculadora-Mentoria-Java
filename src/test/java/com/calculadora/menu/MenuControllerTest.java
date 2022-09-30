package com.calculadora.menu;

import com.calculadora.util.ReadUtil;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mockStatic;

@ExtendWith(MockitoExtension.class)
class MenuControllerTest {
    MenuController menuController = new MenuController();

    @AfterEach
    void afterEach(){

    }

    @Test
    void principal_sair(){
        try(MockedStatic<ReadUtil> readutil = mockStatic(ReadUtil.class)) {
            readutil.when(ReadUtil::readOption).thenReturn(4);
            menuController.run();
            assertEquals(MenuMain.class, menuController.activeMenu.getClass());
        }

    }

    @Test
    void principal_padrao_voltar_sair(){
        try(MockedStatic<ReadUtil> readutil = mockStatic(ReadUtil.class)) {
            readutil.when(ReadUtil::readOption).thenReturn(1).thenReturn(0).thenReturn(4);
            menuController.run();
            assertEquals(MenuMain.class, menuController.activeMenu.getClass());
        }
    }

    @Test
    void principal_imc_voltar_sair(){
        try(MockedStatic<ReadUtil> readutil = mockStatic(ReadUtil.class)) {
            readutil.when(ReadUtil::readOption).thenReturn(2).thenReturn(0).thenReturn(4);
            menuController.run();
            assertEquals(MenuMain.class, menuController.activeMenu.getClass());
        }
    }

    @Test
    void principal_area_voltar_sair(){
        try(MockedStatic<ReadUtil> readutil = mockStatic(ReadUtil.class)) {
            readutil.when(ReadUtil::readOption).thenReturn(3).thenReturn(0).thenReturn(4);
            menuController.run();
            assertEquals(MenuMain.class, menuController.activeMenu.getClass());
        }
    }
}