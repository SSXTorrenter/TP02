/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseTest;

import base.ActiviteDao;
import base.ParticipantDao;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import java.util.*;
/**
 *
 * @author thomas
 */
public class ParticipantDaoTest {
    
    @Test
    public void test_get_Particiapnts(){
        ArrayList list = new ArrayList(ParticipantDao.getListeParticipants());
        assertNotNull(list);
    }
}
