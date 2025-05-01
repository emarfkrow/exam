/**
 * 派生先１グリッド定義
 */

let Tb6HaseiTo1GridColumns = [];

$(function() {
    Tb6HaseiTo1GridColumns = [
        Column.text('HASEI_TO1_ID', Messages['Tb6HaseiTo1Grid.haseiTo1Id'], 90, 'primaryKey numbering', null),
        Column.text('HASEI_ID', Messages['Tb6HaseiTo1Grid.haseiId'], 90, 'notblank', null),
        Column.text('HASEI_INFO', Messages['Tb6HaseiTo1Grid.haseiInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb6HaseiTo1Grid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
