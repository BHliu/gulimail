import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author 刘波华
 * @Data 2021/5/29 13:26
 * @Description
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class mytest {

    @Autowired
    BrandService brandService;

    @Test
    public void context(){
        BrandEntity brandEntity = new BrandEntity();
        //brandEntity.setDescript("nima");
        brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }
}
