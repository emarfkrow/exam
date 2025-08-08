/**
 * 転生２グリッド定義
 */

let Tb8Reborn2GridColumns = [];

$(function() {
    Tb8Reborn2GridColumns = [
        Column.text('REBORN2_ID', Messages['Tb8Reborn2Grid.reborn2Id'], 90, 'primaryKey numbering', null),
        Column.cell('UNIT4_ID', Messages['Tb8Reborn2Grid.unit4Id'], 90, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Tb8Reborn2Grid.updateTs'], 207, 'metaInfo optLock', Slick.Formatters.Extends.Timestamp),
    ];
});
