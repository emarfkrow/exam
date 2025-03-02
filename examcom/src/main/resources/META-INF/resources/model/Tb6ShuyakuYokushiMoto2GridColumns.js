/**
 * 集約抑止元２グリッド定義
 */

let Tb6ShuyakuYokushiMoto2GridColumns = [];

$(function() {
    Tb6ShuyakuYokushiMoto2GridColumns = [
        Column.text('SHUYAKU_YOKUSHI_MOTO2_ID', Messages['Tb6ShuyakuYokushiMoto2Grid.shuyakuYokushiMoto2Id'], 80, 'primaryKey numbering', null),
        Column.text('SHUYAKU_YOKUSHI_ID', Messages['Tb6ShuyakuYokushiMoto2Grid.shuyakuYokushiId'], 80, '', null),
        Column.cell('UPDATE_TS', Messages['Tb6ShuyakuYokushiMoto2Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
