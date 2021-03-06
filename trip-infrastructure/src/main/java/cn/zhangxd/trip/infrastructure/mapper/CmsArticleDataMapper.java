package cn.zhangxd.trip.infrastructure.mapper;

import cn.zhangxd.trip.infrastructure.config.CrudDao;
import cn.zhangxd.trip.infrastructure.config.annotation.MyBatisDao;
import cn.zhangxd.trip.service.api.entity.CmsArticleData;

/**
 * 文章DAO接口
 * Created by zhangxd on 15/10/20.
 */
@MyBatisDao
public interface CmsArticleDataMapper extends CrudDao<CmsArticleData> {
	
}
