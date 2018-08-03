package ext.windchill.util;

import wt.change2.*;
import wt.fc.IdentityHelper;
import wt.fc.QueryResult;
import wt.fc.WTObject;
import wt.util.WTException;
import wt.util.WTPropertyVetoException;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ChangeOrderUtil {

    /**
     * 获取更改单的基本属性
     * @param wtChangeOrder2
     */
    public static void getBaseAttribute(WTChangeOrder2 wtChangeOrder2) {

    }

    /**
     * 获得更改前数据
     *
     * @param wtChangeOrder2
     * @return
     * @throws WTException
     */
    public static List<WTObject> getChangeBeforeObjs(WTChangeOrder2 wtChangeOrder2) throws WTException {
        List<WTObject> list = new ArrayList<WTObject>();
        QueryResult queryResult = ChangeHelper2.service.getChangeActivities(wtChangeOrder2);
        WTChangeActivity2 changeActivity;
        WTObject object;
        while (queryResult.hasMoreElements()) {
            changeActivity = (WTChangeActivity2) queryResult.nextElement();
            queryResult = ChangeHelper2.service.getChangeablesBefore(changeActivity);
            while (queryResult.hasMoreElements()) {
                object = (WTObject) queryResult.nextElement();
                if (list.contains(object)) {
                    continue;
                }
                list.add(object);
            }
        }
        return list;
    }

    /**
     * 获得更改后数据
     * @param wtChangeOrder2
     * @return
     * @throws WTException
     */
    public static List<WTObject> getChangeAfterObjs(WTChangeOrder2 wtChangeOrder2) throws WTException {
        List<WTObject> list = new ArrayList<WTObject>();
        QueryResult queryResult = ChangeHelper2.service.getChangeActivities(wtChangeOrder2);
        WTChangeActivity2 changeActivity;
        WTObject object;
        while (queryResult.hasMoreElements()) {
            changeActivity = (WTChangeActivity2) queryResult.nextElement();
            queryResult = ChangeHelper2.service.getChangeablesAfter(changeActivity);
            while (queryResult.hasMoreElements()) {
                object = (WTObject) queryResult.nextElement();
                if (list.contains(object)) {
                    continue;
                }
                list.add(object);
            }
        }
        return list;
    }

    /**
     * 将数据添加到更改单改前数据中
     *
     * @param wtChangeOrder2
     * @param changeBeforeData
     * @throws WTException
     */
    public static void addChangeBeforeData(WTChangeOrder2 wtChangeOrder2, Vector<?> changeBeforeData) throws WTException {
        QueryResult queryResult = ChangeHelper2.service.getChangeActivities(wtChangeOrder2);
        WTChangeActivity2 changeActivity;
        while (queryResult.hasMoreElements()) {
            changeActivity = (WTChangeActivity2) queryResult.nextElement();
            ChangeHelper2.service.storeAssociations(AffectedActivityData.class, changeActivity, changeBeforeData);
        }
    }

    /**
     * 将数据添加到更改单改后数据中
     *
     * @param wtChangeOrder2
     * @param changeAfterData
     * @throws WTException
     */
    public static void addChangeAfterData(WTChangeOrder2 wtChangeOrder2, Vector<?> changeAfterData) throws WTException {
        QueryResult queryResult = ChangeHelper2.service.getChangeActivities(wtChangeOrder2);
        WTChangeActivity2 changeActivity;
        while (queryResult.hasMoreElements()) {
            changeActivity = (WTChangeActivity2) queryResult.nextElement();
            ChangeHelper2.service.storeAssociations(ChangeRecord2.class, changeActivity, changeAfterData);
        }
    }

    /**
     * 更改通告重命名
     *
     * @param wtChangeOrder2Master
     * @param changeOrderNumber
     * @throws WTException
     */
    public static void renameChangeOrder(WTChangeOrder2Master wtChangeOrder2Master, String changeOrderNumber) throws WTException {
        if (wtChangeOrder2Master != null && changeOrderNumber != null && !"".equals(changeOrderNumber)) {
            WTChangeOrder2MasterIdentity masterIdentity = (WTChangeOrder2MasterIdentity) wtChangeOrder2Master.getIdentificationObject();
            try {
                masterIdentity.setNumber(changeOrderNumber);
                IdentityHelper.service.changeIdentity(wtChangeOrder2Master, masterIdentity);
            } catch (WTPropertyVetoException e) {
                throw new WTException(e);
            }
        }
    }

}
