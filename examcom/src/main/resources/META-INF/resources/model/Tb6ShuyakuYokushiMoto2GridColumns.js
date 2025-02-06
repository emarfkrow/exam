/**
 * 集約抑止元２グリッド定義
 */

let Tb6ShuyakuYokushiMoto2GridColumns = [];

$(function() {
    Tb6ShuyakuYokushiMoto2GridColumns = [
        Column.comma('SHUYAKU_YOKUSHI_MOTO2_ID', Messages['Tb6ShuyakuYokushiMoto2Grid.shuyakuYokushiMoto2Id'], 80, 'primaryKey numbering', null),
        Column.comma('SHUYAKU_YOKUSHI_ID', Messages['Tb6ShuyakuYokushiMoto2Grid.shuyakuYokushiId'], 80, '', null),
        Column.cell('UPDATE_TS', Messages['Tb6ShuyakuYokushiMoto2Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb6ShuyakuYokushiMoto2Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb6ShuyakuYokushiMoto2Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
