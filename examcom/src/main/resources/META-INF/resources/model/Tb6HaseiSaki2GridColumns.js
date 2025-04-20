/**
 * 派生先２グリッド定義
 */

let Tb6HaseiSaki2GridColumns = [];

$(function() {
    Tb6HaseiSaki2GridColumns = [
        Column.text('HASEI_SAKI2_ID', Messages['Tb6HaseiSaki2Grid.haseiSaki2Id'], 90, 'primaryKey numbering', null),
        Column.text('HASEI_MOTO_ID', Messages['Tb6HaseiSaki2Grid.haseiMotoId'], 90, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Tb6HaseiSaki2Grid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
