package com.catalystone.mbs.controller;

import com.catalystone.mbs.entity.Theater;
import com.catalystone.mbs.exception.AdminException;
import com.catalystone.mbs.repository.TheaterRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AdminControllerTest {

    @Mock
    TheaterRepository trepo;

    @InjectMocks
    AdminController controller;

    @Test(expected= AdminException.class)
    public void testDeleteTheaterWithException() throws AdminException {
        controller.deleteTheater(new String("1"));
        Mockito.when(trepo.findByTid(1L)).thenReturn(null);
    }

    @Test
    public void testDeleteTheater()  throws AdminException{
        Theater t = new Theater();
        Mockito.when(trepo.findByTid(1L)).thenReturn(t);
        controller.deleteTheater(new String("1"));
        Mockito.verify(trepo).delete(t);
    }


}
